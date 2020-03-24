package cool.pablo.controller;

import cool.pablo.model.Pair;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PairController {

  @GetMapping("/pair")
  public String getPair(int number) {
    // TODO: get it from somewhere
    return String.format("Asked the pair number: %s", number);
  }

  @PostMapping("/savePair")
  public String savePair(Pair pair) {
    // TODO: save it somewhere
    return String.format("Asked to save (%d, %s)", pair.getNumber(), pair.getMessage());
  }
}
