package com.example.mmt.model;


        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;

@Entity
@Table
public class Flight {

    @Id
    private String id;
    private String departure;
    private String arrival;
    private String departureDate;
    private String arrivalDate;



    public Flight() {
        super();
    }

    public Flight(String id, String departure, String arrival, String departureDate, String arrivalDate) {
        super();
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }




}
