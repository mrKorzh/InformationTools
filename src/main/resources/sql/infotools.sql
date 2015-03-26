CREATE SEQUENCE seq_infotools START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS "public"."infotools" (
  "id"         INT8 DEFAULT nextval('seq_infotools' :: REGCLASS) NOT NULL PRIMARY KEY,
  "type"         INT8,
  "statelongitude"       NUMERIC,
  "statelatitude"       NUMERIC,
  "stateheight"       NUMERIC,
  "zonetype"       INT8,
  "rangemax"       NUMERIC,
  "rangemin"       NUMERIC,
  "azimutmax"       NUMERIC,
  "azimutmin"       NUMERIC,
  "placeanglemax"       NUMERIC,
  "placeanglemin"       NUMERIC,
  "range"       NUMERIC,
  "penetratingpower"       NUMERIC,
  "countintime"       INT8);

CREATE SEQUENCE seq_noise START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS "public"."noise" (
  "id"         INT8 DEFAULT nextval('seq_noise' :: REGCLASS) NOT NULL PRIMARY KEY,
  "lambda"       NUMERIC,
  "height"       NUMERIC,
  "sigmar"       NUMERIC,
  "sigmav"       NUMERIC,
  "sigmatetta"       NUMERIC,
  "sigmax"       NUMERIC,
  "sigmafi"       NUMERIC,
  "sigmab"       NUMERIC);

--select * from infotools

--insert into infotools (type, stateLongitude, stateLatitude, stateHeight, zoneType, rangeMax, rangeMin, azimutMax, azimutMin, placeAngleMax, placeAngleMin, range, penetratingPower, countInTime)
--                values (1, 55.75, 37.36, 144, 1, 4000, 3500, 30, 10, 30, 10, 1000, 300, 100),
--			(1, 51.4, 39.12, 200, 1, 3000, 2000, 20, 5, 20, 5, 1000, 300, 100),
--			(1, 55.5, 37.4, 144, 1, 3500, 2500, 20, 10, 25, 5, 1000, 300, 100)

--select * from infotools

--insert into infotools (type, stateLongitude, stateLatitude, stateHeight, zoneType, rangeMax, rangeMin, azimutMax, azimutMin, placeAngleMax, placeAngleMin, range, penetratingPower, countInTime)
--                values (1, 55.75, 37.36, 144, 1, 4000, 3500, 30, 10, 30, 10, 1000, 300, 100),
--			(1, 51.4, 39.12, 200, 1, 3000, 2000, 20, 5, 20, 5, 1000, 300, 100),
--			(1, 55.5, 37.4, 144, 1, 3500, 2500, 20, 10, 25, 5, 1000, 300, 100)


-- insert into noise (lambda, height, sigmar, sigmav, sigmatetta, sigmax, sigmafi, sigmab)
-- 		values (0, 10, 3, 15, 3, 20, 4, 5),
-- 			(0, 5, 4, 10, 2, 15, 2, 3),
-- 			(0, 15, 7, 18, 2, 14, 2, 8),
-- 			(0, 12, 1, 13, 2, 11, 3, 4)