CREATE TABLE hotel (
  id INT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  address VARCHAR(255),
  description TEXT,
  phone VARCHAR(20),
  email VARCHAR(100)
);

CREATE TABLE room_type (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(255)
);

CREATE TABLE room (
  id INT PRIMARY KEY,
  hotel_id BIGINT NOT NULL,
  room_number VARCHAR(10) NOT NULL,
  room_type_id BIGINT NOT NULL,
  price_per_night DECIMAL(10,2) NOT NULL,
  max_guests INT NOT NULL,
  description TEXT,
  status VARCHAR(20) DEFAULT 'AVAILABLE',
  CONSTRAINT fk_room_hotel FOREIGN KEY (hotel_id) REFERENCES hotel(id),
  CONSTRAINT fk_room_type FOREIGN KEY (room_type_id) REFERENCES room_type(id)
);

CREATE TABLE room_image (
  id INT PRIMARY KEY,
  room_id BIGINT NOT NULL,
  image_url VARCHAR(255) NOT NULL,
  is_main BOOLEAN DEFAULT FALSE,
  CONSTRAINT fk_room_image FOREIGN KEY (room_id) REFERENCES room(id)
);

CREATE TABLE guest (
  id INT PRIMARY KEY,
  full_name VARCHAR(100) NOT NULL,
  email VARCHAR(100),
  phone VARCHAR(20)
);

CREATE TABLE booking (
  id INT PRIMARY KEY,
  room_id BIGINT NOT NULL,
  guest_id BIGINT NOT NULL,
  check_in DATE NOT NULL,
  check_out DATE NOT NULL,
  total_price DECIMAL(10,2),
  status VARCHAR(20) DEFAULT 'PENDING',
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT fk_booking_room FOREIGN KEY (room_id) REFERENCES room(id),
  CONSTRAINT fk_booking_guest FOREIGN KEY (guest_id) REFERENCES guest(id)
);

CREATE TABLE payment (
  id INT PRIMARY KEY,
  booking_id BIGINT NOT NULL,
  amount DECIMAL(10,2) NOT NULL,
  payment_method VARCHAR(20),
  status VARCHAR(20),
  paid_at TIMESTAMP,
  CONSTRAINT fk_payment_booking FOREIGN KEY (booking_id) REFERENCES booking(id)
);

CREATE TABLE user_account (
  id INT PRIMARY KEY,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(20) NOT NULL
);

CREATE TABLE blog (
  id INT PRIMARY KEY,
  title VARCHAR(200) NOT NULL,
  content TEXT,
  thumbnail VARCHAR(255),
  status VARCHAR(20) DEFAULT 'DRAFT',
  published_at TIMESTAMP
);

CREATE TABLE contact_message (
  id INT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  message TEXT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
