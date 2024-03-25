package financecorp.example.finance_flow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class dummy {

    @RequestMapping("/flow")
    public String getFinanceFlow() {
        return "Finance Flow";
    }
}
