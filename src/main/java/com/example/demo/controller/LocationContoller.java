import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


import com.example.model.LocalEntity;
import com.example.service.LocationService;

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