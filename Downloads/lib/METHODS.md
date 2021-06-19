# SQL Library Docs

add throws IOException to main class
## Create methods
### Instantiate Object: No Instance Required
### ``

## Read methods
### Instantiate Object: No Instance Required
### ``

## Update methods
### Instantiate Object: No Instance Required
### ``

## Delete methods
### Instantiate Object: No Instance Required
### `Deletable.deleteTable(STRING_TABLE_NAME_HERE);`

- might need to make a parser to make sql commands
  universal which the parser identifies which operation is
  taking place and uses the classes accordingly

# planned methods:
create:
- create table ✅
- create a new item and append data to table ✅ (check types later on)
- create new column

read:
- read all data ✅
  (store in linked list or some sort of list)
  (an sql data converter that downloads all data from database and stores sql commands in a sql file)
- read specific data

update:
- update a column
- update an item

delete:
- delete a column
- delete a table ✅

Run Command without output:
- run any sql command without any output (one way command) ✅