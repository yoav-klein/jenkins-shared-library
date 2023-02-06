
def deploymentClone(repoName, branch) {
    println "This the deploymentClone"
    println "Cloning $repoName, $branch"
}

def flow() {
    println "This is the flow function"
    
    this.deploymentClone("sws-service", "main")
    
    println "Read resource"
    def data = libraryResource 'com/yoav/jenkins/envVars.json'
    println data
    println isThisAvailableInLibrary
}
