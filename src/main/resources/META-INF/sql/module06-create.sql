CREATE TABLE AUTHOR (ID BIGINT NOT NULL, date_of_birth DATE, first_name VARCHAR(50), last_name VARCHAR(50), preferred_Language VARCHAR, PRIMARY KEY (ID))
CREATE TABLE MUSICIAN (ID BIGINT NOT NULL, date_of_birth DATE, first_name VARCHAR(50), last_name VARCHAR(50), preferred_instrument VARCHAR, PRIMARY KEY (ID))
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT NUMERIC(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)