FROM jboss/wildfly
ARG artifact_id
ARG artifact_version
ENV war_file="${artifact_id}-${artifact_version}.war"
COPY target/${war_file} /opt/jboss/wildfly/standalone/deployments/
ENTRYPOINT ["sh", "-c"]
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]