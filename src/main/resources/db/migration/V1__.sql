CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE address
(
    id           BIGINT       NOT NULL,
    house_number VARCHAR(255) NOT NULL,
    street       VARCHAR(255) NOT NULL,
    city         VARCHAR(255) NOT NULL,
    entrance     INTEGER,
    position_id  BIGINT       NOT NULL,
    CONSTRAINT pk_address PRIMARY KEY (id)
);

CREATE TABLE car
(
    id                BIGINT       NOT NULL,
    license_plate     VARCHAR(6)  NOT NULL,
    region            INTEGER      NOT NULL,
    driver_id         BIGINT       NOT NULL,
    colour            VARCHAR(255) NOT NULL,
    car_model_id      BIGINT       NOT NULL,
    production_date   date,
    comfort_class     INTEGER      NOT NULL DEFAULT 0,
    child_safety_seat INTEGER               DEFAULT 0,
    CONSTRAINT pk_car PRIMARY KEY (id)
);

CREATE TABLE car_model
(
    id    BIGINT       NOT NULL,
    model VARCHAR(255) NOT NULL,
    brand VARCHAR(255) NOT NULL,
    CONSTRAINT pk_car_model PRIMARY KEY (id)
);

CREATE TABLE card
(
    id          BIGINT       NOT NULL,
    card_number VARCHAR(255) NOT NULL,
    expire_date date         NOT NULL,
    cvc_cvv     INTEGER      NOT NULL,
    CONSTRAINT pk_card PRIMARY KEY (id)
);

CREATE TABLE driver
(
    id                  BIGINT           NOT NULL,
    first_name          VARCHAR(255)     NOT NULL,
    last_name           VARCHAR(255)     NOT NULL,
    date_of_birth       date             NOT NULL,
    rating              DOUBLE PRECISION NOT NULL DEFAULT 5.0,
    card_id             BIGINT           NOT NULL,
    drivers_license     VARCHAR(255)     NOT NULL UNIQUE,
    certification_level INTEGER,
    position_id         BIGINT,
    driver_id           BIGINT,
    CONSTRAINT pk_driver PRIMARY KEY (id)
);

CREATE TABLE fare
(
    id                 BIGINT           NOT NULL,
    name               VARCHAR(255)     NOT NULL,
    city               VARCHAR(255)     NOT NULL,
    price_for_distance DOUBLE PRECISION NOT NULL,
    price_for_waiting  DOUBLE PRECISION NOT NULL,
    CONSTRAINT pk_fare PRIMARY KEY (id)
);

CREATE TABLE passenger
(
    id            BIGINT           NOT NULL,
    first_name    VARCHAR(255)     NOT NULL,
    last_name     VARCHAR(255)     NOT NULL,
    date_of_birth date             NOT NULL,
    rating        DOUBLE PRECISION NOT NULL DEFAULT 5.0,
    card_id       BIGINT           NOT NULL,
    discount      DOUBLE PRECISION NOT NULL DEFAULT 0.0,
    CONSTRAINT pk_passenger PRIMARY KEY (id)
);

CREATE TABLE payment
(
    id           BIGINT  NOT NULL,
    payment_type INTEGER NOT NULL,
    success      BOOLEAN NOT NULL DEFAULT false,
    payment_date date    NOT NULL,
    CONSTRAINT pk_payment PRIMARY KEY (id)
);

CREATE TABLE position
(
    id        BIGINT           NOT NULL,
    latitude  DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    CONSTRAINT pk_position PRIMARY KEY (id)
);

CREATE TABLE price
(
    id           BIGINT           NOT NULL,
    fare_id      BIGINT           NOT NULL,
    waiting_time INTEGER DEFAULT 0,
    full_price   DOUBLE PRECISION NOT NULL,
    CONSTRAINT pk_price PRIMARY KEY (id)
);

CREATE TABLE trip
(
    id                  BIGINT                      NOT NULL,
    trip_request_id     BIGINT                      NOT NULL,
    driver_id           BIGINT                      NOT NULL,
    payment_id          BIGINT                      NOT NULL,
    arriving_datetime   TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    start_trip_datetime TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    end_trip_datetime   TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_trip PRIMARY KEY (id)
);

CREATE TABLE trip_addresses
(
    id              BIGINT  NOT NULL,
    order_in_trip   INTEGER NOT NULL,
    address_id      BIGINT  NOT NULL,
    trip_request_id BIGINT  NOT NULL,
    CONSTRAINT pk_trip_addresses PRIMARY KEY (id)
);

CREATE TABLE trip_request
(
    id                   BIGINT                      NOT NULL,
    datetime_of_creation TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    price_id             BIGINT                      NOT NULL,
    passenger_id         BIGINT,
    distance             DOUBLE PRECISION            NOT NULL DEFAULT 0.0,
    is_cancelled         BOOLEAN                              DEFAULT false,
    CONSTRAINT pk_trip_request PRIMARY KEY (id)
);

ALTER TABLE card
    ADD CONSTRAINT uc_card_card_number UNIQUE (card_number);

ALTER TABLE car
    ADD CONSTRAINT FK_CAR_ON_CAR_MODEL FOREIGN KEY (car_model_id) REFERENCES car_model (id);

ALTER TABLE car
    ADD CONSTRAINT FK_CAR_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_CARD FOREIGN KEY (card_id) REFERENCES card (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE driver
    ADD CONSTRAINT FK_DRIVER_ON_POSITION FOREIGN KEY (position_id) REFERENCES position (id);

ALTER TABLE passenger
    ADD CONSTRAINT FK_PASSENGER_ON_CARD FOREIGN KEY (card_id) REFERENCES card (id);

ALTER TABLE price
    ADD CONSTRAINT FK_PRICE_ON_FARE FOREIGN KEY (fare_id) REFERENCES fare (id);

ALTER TABLE trip_addresses
    ADD CONSTRAINT FK_TRIP_ADDRESSES_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES address (id);

ALTER TABLE trip_addresses
    ADD CONSTRAINT FK_TRIP_ADDRESSES_ON_TRIP_REQUEST FOREIGN KEY (trip_request_id) REFERENCES trip_request (id);

ALTER TABLE trip
    ADD CONSTRAINT FK_TRIP_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE trip
    ADD CONSTRAINT FK_TRIP_ON_PAYMENT FOREIGN KEY (payment_id) REFERENCES payment (id);

ALTER TABLE trip
    ADD CONSTRAINT FK_TRIP_ON_TRIP_REQUEST FOREIGN KEY (trip_request_id) REFERENCES trip_request (id);

ALTER TABLE trip_request
    ADD CONSTRAINT FK_TRIP_REQUEST_ON_PASSENGER FOREIGN KEY (passenger_id) REFERENCES passenger (id);

ALTER TABLE trip_request
    ADD CONSTRAINT FK_TRIP_REQUEST_ON_PRICE FOREIGN KEY (price_id) REFERENCES price (id);