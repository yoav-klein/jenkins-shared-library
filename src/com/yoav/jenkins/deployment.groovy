
def deploymentClone(repoName, branch) {
    println "This the deploymentClone"
    println "Cloning $repoName, $branch"
}

def flow() {
    println "This is the flow function"
    deploymentClone("sws-service", "main")
}
