package nl.nfi.sandbox.cloudcontract.producer.api.v1;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProfileDTO {
    private final String sin;
    private final String caseNumber;
    private final List<LocusDTO> loci;
}