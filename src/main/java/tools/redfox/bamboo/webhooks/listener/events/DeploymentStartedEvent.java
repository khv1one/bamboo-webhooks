package tools.redfox.bamboo.webhooks.listener.events;

import tools.redfox.bamboo.webhooks.listener.events.model.Build;
import tools.redfox.bamboo.webhooks.listener.events.model.Plan;


public class DeploymentStartedEvent extends AbstractEvent {
    private final String version;
    private final String environment;
    private final String creatorUserName;
    private final String planBranchName;
    private final String reasonSummary;

    public DeploymentStartedEvent(
            String projectName,
            Plan plan,
            Build build,
            String version,
            String environment,
            String creatorUserName,
            String planBranchName,
            String reasonSummary
    ) {
        super(projectName, plan, build);
        this.version = version;
        this.environment = environment;
        this.creatorUserName = creatorUserName;
        this.planBranchName = planBranchName;
        this.reasonSummary = reasonSummary;
    }

    public String getVersion() {
        return version;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }

    public String getPlanBranchName() {
        return planBranchName;
    }

    public String getReasonSummary() {
        return reasonSummary;
    }

    @Override
    protected String getEventName() {
        return "Deployment Started";
    }
}
