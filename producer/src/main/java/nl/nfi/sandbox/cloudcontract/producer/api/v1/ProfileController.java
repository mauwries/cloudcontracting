package nl.nfi.sandbox.cloudcontract.producer.api.v1;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/profile")
public class ProfileController {

    @GetMapping("{sin}")
    public ProfileDTO getProfile(@PathVariable("sin") final String sin) {
        final AlleleDTO allele1 = AlleleDTO.builder().name("12").quantity(100).build();
        final AlleleDTO allele2 = AlleleDTO.builder().name("14").quantity(250).build();
        final AlleleDTO allele3 = AlleleDTO.builder().name("8").quantity(202).build();
        final LocusDTO locus1 = LocusDTO.builder().name("D3S1358").alleles(Set.of(allele1, allele2)).build();
        final LocusDTO locus2 = LocusDTO.builder().name("D2S441").alleles(Set.of(allele3)).build();

        return ProfileDTO.builder()
            .sin(sin)
            .caseNumber("2020.01.01.001")
            .loci(List.of(locus1, locus2))
            .build();
    }

    @PutMapping("{sin}")
    public ProfileDTO updateProfile(@RequestBody ProfileDTO profile) {
        return ProfileDTO.builder()
            .sin(profile.getSin())
            .caseNumber(profile.getCaseNumber())
            .loci(profile.getLoci())
            .build();
    }

}
