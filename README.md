# FlightDemoSelenium
# Download the FlightRes.java and testng.xml .
# Create a package with name com.priyanka.flightReservation.FlightReservation and import the above downloaded files in the same package and run.



# Framework- A maven project has been created and then Testng class is created. Parameterization for the project has been done with help of Testng.xml
# A setup method is created as a @BeforeMethod to initialize the chrome driver and launch the URL.
# @Test indentifies the End to End Test case , where the flight from and To port is chosen, flight is reserved from the list of displayed flights
# Assertions are used to validate that page which is displayed is the correct page as per acceptance criteria.
# @AfterMethod is used to close the browser
# The pages navigated and validated are Find Flight, Choose Flight,Book Flight and Booking Confirmation
