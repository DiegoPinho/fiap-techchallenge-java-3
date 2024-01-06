CREATE DATABASE fiap_techchallenge_3;

CREATE TABLE movies (
  id SERIAL PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  link VARCHAR(255),
  publication TIMESTAMP
);

-- CREATE TABLE addresses (
--   id SERIAL PRIMARY KEY,
--   street VARCHAR(255) NOT NULL,
--   district VARCHAR(255) NOT NULL,
--   city VARCHAR(255) NOT NULL,
--   state VARCHAR(255) NOT NULL
-- );

-- CREATE TABLE parking_meters (
--   id SERIAL PRIMARY KEY,
--   serial VARCHAR(255) NOT NULL,
--   price NUMERIC(10,2),
--   address_id INTEGER,

--   CONSTRAINT fk_address FOREIGN KEY (address_id) REFERENCES addresses(id)
-- );

-- CREATE TABLE parks (
--   id SERIAL PRIMARY KEY,
--   vehicle_id INTEGER NOT NULL,
--   parking_meter_id INTEGER NOT NULL,
--   start_date DATE DEFAULT current_date,
--   end_date DATE,
--   total NUMERIC(10,2),

--   CONSTRAINT fk_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicles(id),
--   CONSTRAINT fk_parking_meter FOREIGN KEY (parking_meter_id) REFERENCES parking_meters(id)
-- );
