package nl.nfi.sandbox.cloudcontract.producer.api.v1;

import java.util.Set;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LocusDTO {
    public String name;
    public Set<AlleleDTO> alleles;
}