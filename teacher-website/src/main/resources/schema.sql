USE school_info_db;

CREATE TABLE IF NOT EXISTS emails (
                                      id INT AUTO_INCREMENT PRIMARY KEY,
                                      email VARCHAR(255) NOT NULL
);