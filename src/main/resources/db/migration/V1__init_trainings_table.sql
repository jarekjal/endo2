create table if not exists trainings(
    id serial primary key,
    start timestamp,
    activity varchar(50) not null,
    distance integer,
    duration integer not null,
    description varchar(200)
)