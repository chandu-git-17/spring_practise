CREATE SEQUENCE IF NOT EXISTS category_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS product_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE category
(
    id            BIGINT  NOT NULL,
    is_deleted    BOOLEAN NOT NULL,
    created_at    TIMESTAMP WITHOUT TIME ZONE,
    updated_at    TIMESTAMP WITHOUT TIME ZONE,
    category_name VARCHAR(255),
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE joined_instructor
(
    user_id        BIGINT NOT NULL,
    specialization VARCHAR(255),
    CONSTRAINT pk_joinedinstructor PRIMARY KEY (user_id)
);

CREATE TABLE joined_student
(
    user_id BIGINT NOT NULL,
    batch   VARCHAR(255),
    CONSTRAINT pk_joinedstudent PRIMARY KEY (user_id)
);

CREATE TABLE joined_user
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_joineduser PRIMARY KEY (id)
);

CREATE TABLE mapped_instructor
(
    id             BIGINT NOT NULL,
    name           VARCHAR(255),
    specialization VARCHAR(255),
    CONSTRAINT pk_mapped_instructor PRIMARY KEY (id)
);

CREATE TABLE mapped_student
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255),
    batch VARCHAR(255),
    CONSTRAINT pk_mapped_student PRIMARY KEY (id)
);

CREATE TABLE product
(
    id          BIGINT           NOT NULL,
    is_deleted  BOOLEAN          NOT NULL,
    created_at  TIMESTAMP WITHOUT TIME ZONE,
    updated_at  TIMESTAMP WITHOUT TIME ZONE,
    title       VARCHAR(255),
    price       DOUBLE PRECISION NOT NULL,
    description VARCHAR(255),
    category_id BIGINT,
    imageurl    VARCHAR(255),
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE single_base_model
(
    id             BIGINT  NOT NULL,
    user_type      INTEGER NOT NULL,
    name           VARCHAR(255),
    specialization VARCHAR(255),
    batch          VARCHAR(255),
    CONSTRAINT pk_singlebasemodel PRIMARY KEY (id)
);

CREATE TABLE tpc_base_model
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_tpcbasemodel PRIMARY KEY (id)
);

CREATE TABLE tpc_instructor
(
    id             BIGINT NOT NULL,
    name           VARCHAR(255),
    specialization VARCHAR(255),
    CONSTRAINT pk_tpcinstructor PRIMARY KEY (id)
);

CREATE TABLE tpc_student
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255),
    batch VARCHAR(255),
    CONSTRAINT pk_tpcstudent PRIMARY KEY (id)
);

ALTER TABLE joined_instructor
    ADD CONSTRAINT FK_JOINEDINSTRUCTOR_ON_USER FOREIGN KEY (user_id) REFERENCES joined_user (id);

ALTER TABLE joined_student
    ADD CONSTRAINT FK_JOINEDSTUDENT_ON_USER FOREIGN KEY (user_id) REFERENCES joined_user (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category (id);