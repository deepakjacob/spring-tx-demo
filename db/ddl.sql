-- Valid only for Postgresql environments

CREATE TABLE BOOK (
    ISBN         VARCHAR(50),
    BOOK_NAME    VARCHAR(100),
    PRICE        DECIMAL,
    PRIMARY KEY (ISBN)
);
CREATE TABLE BOOK_STOCK (
    ISBN     VARCHAR(50),
    STOCK    INT,
    PRIMARY KEY (ISBN),
    CHECK (STOCK >= 0)
);
CREATE TABLE ACCOUNT (
    USERNAME    VARCHAR(50),
    BALANCE     DECIMAL,
    PRIMARY KEY (USERNAME),
    CHECK (BALANCE >= 0)
);

