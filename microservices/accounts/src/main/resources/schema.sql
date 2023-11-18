CREATE TABLE IF NOT EXISTS customer
(
    customer_id
    BIGINT
    GENERATED
    BY
    DEFAULT as
    IDENTITY,
    name
    VARCHAR
(
    100
) NOT NULL,
    email VARCHAR
(
    100
) NOT NULL,
    mobile_number VARCHAR
(
    13
) NOT NULL,
    created_at DATE NOT NULL,
    created_by VARCHAR
(
    20
) DEFAULT NULL,
    updated_at DATE DEFAULT NULL,
    updated_by VARCHAR
(
    20
) DEFAULT NULL,
    PRIMARY KEY
(
    customer_id
)
    );

CREATE TABLE IF NOT EXISTS accounts
(
    customer_id
    BIGINT
    NOT
    NULL,
    account_number
    BIGINT
    GENERATED
    BY
    DEFAULT as
    IDENTITY,
    account_type
    VARCHAR
(
    100
) NOT NULL,
    branch_address VARCHAR
(
    200
) NOT NULL,
    created_at DATE NOT NULL,
    created_by VARCHAR
(
    20
) DEFAULT NULL,
    updated_at DATE DEFAULT NULL,
    updated_by VARCHAR
(
    20
) DEFAULT NULL,
    PRIMARY KEY
(
    account_number
)
    );