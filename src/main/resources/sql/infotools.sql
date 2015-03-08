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