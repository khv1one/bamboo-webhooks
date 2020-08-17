package tools.redfox.bamboo.webhooks.listener.events;

import tools.redfox.bamboo.webhooks.listener.events.model.Build;
import tools.redfox.bamboo.webhooks.listener.events.model.Plan;

public class DeploymentFinishedEvent extends DeploymentStartedEvent {
    private final String status;

    public DeploymentFinishedEvent(
            String projectName,
            Plan plan, Build build,
            String version,
            String environment,
            String authorName,
            String branch,
            String reasonSummary,
            String status
    ) {
        super(projectName, plan, build, version, environment, authorName, branch, reasonSummary);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    protected String getEventName() {
        return "Deployment Finished";
    }
}
