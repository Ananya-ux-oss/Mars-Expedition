class ResearchProject {
    private String projectname;
    private int progress;
    private boolean completed;

    ResearchProject(String projectname, int progress, boolean completed) {
        this.projectname = projectname;
        this.progress = progress;
        this.completed = completed;
    }

    public String getProjectname() {
        return projectname;
    }
    public int getProgress() {
        return progress;
    }
    public boolean getCompleted() {
        return completed;
    }

    public void conductResearch() {
    if (completed) {
        System.out.println("Project already completed.");
        return;
    }
    progress += 10;

    if (progress >= 100) {
        progress = 100;
        completed = true;
        System.out.println("Research project completed!");
    } else {
        System.out.println("Research in progress... " + progress + "%");
    }
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