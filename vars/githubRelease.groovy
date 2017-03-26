def call(repo, tag, credentialsId) {
	withCredentials([string(
		credentialsId: credentialsId,
		variable: 'token')
	]) {
		sh(
			script: """curl -s \
				-H "Accept: application/vnd.github.v3+json" \
				-H "Content-Type: application/json" \
				-H "Authorization: token ${token}" \
				-X POST \
				-d '{"tag_name": "${tag}"}' \
				"https://api.github.com/repos/${repo}/releases" \
			"""
		)
	}
}
