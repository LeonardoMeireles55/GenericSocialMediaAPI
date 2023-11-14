CREATE TABLE chats (
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_sender BIGINT NOT NULL,
    id_receiver BIGINT NOT NULL,
    chat_text VARCHAR(255),
    chat_time VARCHAR(25),
    PRIMARY KEY (id),
    INDEX (id_sender),
    INDEX (id_receiver),
    FOREIGN KEY (id_sender) REFERENCES users(id),
    FOREIGN KEY (id_receiver) REFERENCES users(id)
)