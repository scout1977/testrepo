import groovy.sql.Sql

//static void main(String[] args) {


  final String url = "jdbc:postgresql://localhost/testdb"
  final String user = "postgres"
  final String password = "strenggeheim"
  final String driver = "org.postgresql.Driver"

  Sql.withInstance(url, user, password, driver) { sql ->
    sql.eachRow('select distinct text1 from testtable') { row ->
      println "row.country_code ${row.text1}"
    }
  }
//}