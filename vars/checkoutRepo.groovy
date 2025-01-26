// vars/checkoutRepo.groovy

def call(String repoUrl, String branch = 'main') {
    echo "Checking out repository from ${repoUrl} with branch ${branch}"
if (repoUrl == '') {
        error "Repository URL is required"
    }
    // Checkout the GitHub repository using the Git plugin
    git branch: branch, url: repoUrl
}


