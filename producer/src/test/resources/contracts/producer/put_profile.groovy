import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'PUT'
        url '/api/v1/profile/sinToUpdate'
        body([
                "sin"       : "sinToUpdate",
                "caseNumber": "2023.02.01.321",
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
    response {
        status OK()
        body([
                "sin"       : "sinToUpdate",
                "caseNumber": "2023.02.01.321",
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

