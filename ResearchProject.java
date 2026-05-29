class ResearchProject {
    private String projectname;
    private int progress;
    private boolean completed;

    ResearchProject(String projectname, int progress, boolean completed) {
        this.projectname = projectname;
        this.progress = progress;
        this.completed = completed;
    }

    //GETTERS
    public String getProjectname() {
        return projectname;
    }
    public int getProgress() {
        return progress;
    }
    public boolean getCompleted() {
        return completed;
    }

    //METHODS
    public void startResearch(Scientist scientist){
        scientist.performDuty();
    }
    
    public void completeResearch(){
        progress = 100;
        isCompleted = true;
        System.out.println("Project Completed.");
    }
    
    public void showProgress() {
        System.out.println(
            "=== Research Project ===" +
            "\nProject Name: " + projectname +
            "\nProgress: " + progress + "%" +
            "\nCompleted: " + completed
        );
    }
}
