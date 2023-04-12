--======================================================
-- ONE TO MANY
--======================================================
create table REPORT
(
    ID  INT identity PRIMARY KEY,
    CONTENT VARCHAR(255),
    IMAGE      BLOB(255)

);


create table SUB_REPORTS
(
    ID  INT identity primary key,
    SUB_CONTENT   VARCHAR(255)
);

alter table SUB_REPORTS add SUB_RPT_FK int;

alter table SUB_REPORTS
    add constraint CHILD_PARENT_ID_PARENT_FK
        foreign key (SUB_RPT_FK) references REPORT;
