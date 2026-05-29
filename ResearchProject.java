class ResearchProject {
    private String projectName;
    private int progress;
    private boolean isCompleted;

    ResearchProject(String projectName, int progress, boolean isCompleted) {
        this.projectName = projectName;
        this.progress = progress;
        this.isCompleted = isCompleted;
    }

    //GETTERS
    public String getProjectName() {
        return projectName;
    }
    public int getProgress() {
        return progress;
    }
    public boolean getIsCompleted() {
        return isCompleted;
    }

    //METHODS
    public void startResearch(Scientist scientist){
        scientist.performDuty();
    }
    
    public void completeResearch(Scientist scientist){
        progress = 100;
        isCompleted = true;
        scientist.researchPoints++;
        System.out.println("Project Completed.");
    }
    
    public void showProgress() {
        System.out.println(
            "=== Research Project ===" +
            "\nProject Name: " + projectName +
            "\nProgress: " + progress + "%" +
            "\nCompleted: " + isCompleted
        );
    }
}
