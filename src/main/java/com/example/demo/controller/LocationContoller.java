@RestContrller
public class LocationController{
  @Autowired
  LocationService locationService;
  @PostMapping("/addlocation")
  public LocalEntity add(@RequestBody LocalEntity le){
    return locationservice.createlocation(le);

  }
  @GetMapping("/showlocation")
  public List<LocalEntity>show(){
    return locationservice.getalllocation();

  }



}