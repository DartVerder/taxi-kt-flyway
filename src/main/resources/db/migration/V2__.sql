INSERT INTO card (id, card_number, expire_date, cvc_cvv)
VALUES (1, '374245455400126', '2024-01-01', 222);

INSERT INTO card (id, card_number, expire_date, cvc_cvv)
VALUES (2, '374245455400127', '2027-01-01', 432);

INSERT INTO card (id, card_number, expire_date, cvc_cvv)
VALUES (3, '374245455400128', '2025-04-01', 421);

INSERT INTO card (id, card_number, expire_date, cvc_cvv)
VALUES (4, '374245455400129', '2025-03-01', 454);

INSERT INTO position (id, latitude, longitude)
VALUES (1, 0.00001, 0.00001);

INSERT INTO position (id, latitude, longitude)
VALUES (2, 0.000011, 0.000011);

INSERT INTO position (id, latitude, longitude)
VALUES (3, 0.000012, 0.000012);

INSERT INTO position (id, latitude, longitude)
VALUES (4, 0.000015, 0.000015);

INSERT INTO driver (id, first_name, last_name, date_of_birth, rating, drivers_license, card_id, position_id)
VALUES (1, 'Ivan', 'Ivanov', '1970-02-01', 4.9, '123123', 1, 1);

INSERT INTO driver (id, first_name, last_name, date_of_birth, drivers_license, card_id, position_id)
VALUES (2, 'Petr', 'Petrov', '1995-06-16', '123124', 2, 2);

INSERT INTO passenger (id, first_name, last_name, date_of_birth, rating, card_id)
VALUES (1, 'Maria', 'Ivanova', '1980-01-01', 5.0, 3);

INSERT INTO passenger (id, first_name, last_name, date_of_birth, rating, card_id)
VALUES (2, 'Anton', 'Kabanov', '1996-03-30', 4.5, 4);

INSERT INTO car_model (id, model, brand)
VALUES (1, 'Vesta', 'LADA');

INSERT INTO car_model (id, model, brand)
VALUES (2, 'Volkswagen', 'Polo');

INSERT INTO car (id, colour, production_date, comfort_class, license_plate, region , driver_id, car_model_id)
VALUES (1, 'red', NOW(), 0, 'A123BC',163, 1, 1);

INSERT INTO car (id, colour, production_date, comfort_class, license_plate, region, driver_id, car_model_id)
VALUES (2, 'black', '2021-01-01', 2, 'A444BC',163, 2, 2);

INSERT INTO address (id, house_number, entrance, city, street, position_id)
VALUES (1, '2', 1, 'Samara', 'Kuybisheva', 1);

INSERT INTO address (id, house_number, entrance, city, street, position_id)
VALUES (2, '32', 2, 'Samara', 'Venceka', 2);

INSERT INTO address (id, house_number, city, street, position_id)
VALUES (3, '1', 'Samara', 'Tashkentskaya', 3);

INSERT INTO address (id, house_number, city, street, position_id)
VALUES (4, '55', 'Samara', 'Kuybisheva', 4);

INSERT INTO fare (id, name, city, price_for_distance, price_for_waiting)
VALUES (1, 'economy', 'Samara', 12, 5);

INSERT INTO fare (id, name, city, price_for_distance, price_for_waiting)
VALUES (2, 'comfort', 'Samara', 20, 5);

INSERT INTO price (id, full_price, waiting_time, fare_id)
VALUES (1, 200, 0, 1);

INSERT INTO price (id, full_price, waiting_time, fare_id)
VALUES (2, 400, 3, 2);

INSERT INTO price (id, full_price, waiting_time, fare_id)
VALUES (3, 500, 3, 1);

INSERT INTO trip_request (id, datetime_of_creation, price_id, passenger_id)
VALUES (1, NOW(), 1, 1);

INSERT INTO trip_request (id, datetime_of_creation, price_id, passenger_id)
VALUES (2, NOW(), 2, 2);

INSERT INTO trip_request (id, datetime_of_creation, price_id, passenger_id)
VALUES (3, NOW(), 3, 2);

INSERT INTO payment (id, payment_type, success, payment_date)
VALUES (1, 1, FALSE, NOW());

INSERT INTO payment (id, payment_type, success, payment_date)
VALUES (2, 1, TRUE, NOW());

INSERT INTO trip (id, trip_request_id, payment_id, arriving_datetime, start_trip_datetime, end_trip_datetime, driver_id)
VALUES (1, 1, 1, NOW(), NOW(), NOW(), 1);

INSERT INTO trip (id, trip_request_id, payment_id, arriving_datetime, start_trip_datetime, end_trip_datetime, driver_id)
VALUES (2, 2, 2, NOW(), NOW(), NOW(), 2);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (1, 0, 1, 1);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (2, 1, 2, 1);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (3, 1, 3, 2);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (4, 2, 4, 2);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (5, 3, 1, 2);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (6, 0, 1, 3);

INSERT INTO trip_addresses (id, order_in_trip, address_id, trip_request_id)
VALUES (7, 1, 2, 3);