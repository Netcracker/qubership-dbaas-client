package org.qubership.cloud.dbaas.client.cassandra.migration.repository;

import org.qubership.cloud.dbaas.client.cassandra.migration.session.SchemaMigrationSession;

public abstract class AbstractCqlRepository {
    protected final SchemaMigrationSession session;

    protected AbstractCqlRepository(SchemaMigrationSession session) {
        this.session = session;
    }
}
