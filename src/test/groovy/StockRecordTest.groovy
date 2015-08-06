import spock.lang.Specification

class StockRecordTest extends Specification {
    def "toString returns correct string"() {
        setup:
            StockRecord record = new StockRecord()
            record.date = new Date(0)
            record.min = new BigDecimal(100)
            record.max = new BigDecimal(200)
        when:
            def result = record.toString()
        then:
            result == "date=Thu Jan 01 01:00:00 CET 1970; min=100; max=200;"
    }
}
