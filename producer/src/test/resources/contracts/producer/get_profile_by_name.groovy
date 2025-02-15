import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/api/v1/profile/someSin'
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body([
                "sin"       : "someSin",
                "caseNumber": "2020.01.01.001",
                "loci"      : [
                        [
                                "name"   : "D3S1358",
                                "alleles": [
                                        [
                                                "name"    : "14",
                                                "quantity": 250.0
                                        ],
                                        [
                                                "name"    : "12",
                                                "quantity": 100.0
                                        ]
                                ]
                        ],
                        [
                                "name"   : "D2S441",
                                "alleles": [
                                        [
                                                "name"    : "8",
                                                "quantity": 202.0
                                        ]
                                ]
                        ]
                ]

        ])
        headers {
            contentType('application/json')
        }
    }
}

