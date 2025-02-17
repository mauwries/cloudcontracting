package nl.nfi.sandbox.cloudcontract.consumer.client;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProfileDTO {
    private final String sin;
    private final String caseNumber;
    private final List<LocusDTO> loci;
}