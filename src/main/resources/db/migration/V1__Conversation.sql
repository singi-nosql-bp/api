create extension if not exists "uuid-ossp";

CREATE TABLE conversation
(
    id         uuid DEFAULT uuid_generate_v4(),
    created_at timestamp without time zone default (now() at time zone 'utc') not null
);