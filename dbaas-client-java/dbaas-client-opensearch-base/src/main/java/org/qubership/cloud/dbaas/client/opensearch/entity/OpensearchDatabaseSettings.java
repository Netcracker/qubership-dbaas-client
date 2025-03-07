package org.qubership.cloud.dbaas.client.opensearch.entity;

import org.qubership.cloud.dbaas.client.entity.database.DatabaseSettings;
import lombok.Data;

import java.util.List;

@Data
public class OpensearchDatabaseSettings implements DatabaseSettings {
    private Boolean resourcePrefix;

    private List<String> createOnly;
}
