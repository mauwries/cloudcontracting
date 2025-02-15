package nl.nfi.sandbox.cloudcontract.producer.api.v1;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AlleleDTO {
    public String name;
    public double quantity;
}
