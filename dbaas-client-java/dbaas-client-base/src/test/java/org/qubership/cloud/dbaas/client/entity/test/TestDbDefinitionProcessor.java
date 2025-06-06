package org.qubership.cloud.dbaas.client.entity.test;

import org.qubership.cloud.dbaas.client.management.DatabaseDefinitionProcessor;

public class TestDbDefinitionProcessor implements DatabaseDefinitionProcessor<TestDatabase> {

    @Override
    public void process(TestDatabase database) {
        TestDBConnection.TestClient testClient = database.getConnectionProperties().getTestClient();
        // do some migrations or init procedures
    }

    @Override
    public Class<TestDatabase> getSupportedDatabaseType() {
        return TestDatabase.class;
    }
}
