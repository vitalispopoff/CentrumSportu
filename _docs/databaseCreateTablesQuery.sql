CREATE TABLE usertype(
	usertypeid	SERIAL	PRIMARY KEY NOT NULL,
	usertypename	TEXT NOT NULL
);

CREATE TABLE gymuser (
	userid	INT	PRIMARY KEY	NOT NULL,
	usertypeid	INT	NOT NULL REFERENCES usertype (usertypeid),
	login	TEXT	NOT NULL,
	firstname	TEXT	NOT NULL,
	surname	TEXT	NOT NULL,
	mail	TEXT,
	gympassstatus BOOLEAN,	-- not sure of it
	profilepic TEXT			-- img src , filename ?
);

CREATE TABLE workouttype(
	workouttypeid SERIAL PRIMARY KEY NOT NULL,
	workouttypename TEXT NOT NULL
);

CREATE TABLE workout(
	workoutid	SERIAL PRIMARY KEY NOT NULL,
	workouttypeid	INT	NOT NULL REFERENCES workouttype (workouttypeid),
	userid 	INT NOT NULL REFERENCES gymuser (userid),	--should be a trainer only , how to make it happen tho?
	roomid	INT NOT NULL,
	maxnumberofmembers INT NOT NULL,	-- incl. personal training and openspace? shouldn't it be in the room specs?
	date	BIGINT NOT NULL		-- epochtime ms ?
);

CREATE TABLE pass(
	passid SERIAL PRIMARY KEY NOT NULL,
	userid	INT		NOT NULL REFERENCES gymuser (userid),		-- should be a client only, how to make it happen?
	startofaccess TEXT NOT NULL,
	endofaccess	TEXT NOT NULL,	
--	daysofaccess INT			'tis but a scratch
);

CREATE TABLE reservation(
	reservationid SERIAL PRIMARY KEY NOT NULL,
	userid INT NOT NULL REFERENCES gymuser (userid),
	workoutid INT NOT NULL REFERENCES workout (workoutid),
	statusofreservation TEXT NOT NULL --  reservation status for when there more peeps than slots in the training

);










