@RestContrller
public class LocationController{
  @Autowired
  LocationService LocationService
  @PostMapping("/addstudent")
  public LocalEntity add(@RequestBody LocalEntity le){
    return locationservice.createlocation(le);

  }
  @GetMapping("/showlocation")
  public List<LocalEntity>show(){
    return locationservice.getalllocation();

  }



}