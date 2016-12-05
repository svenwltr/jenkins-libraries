def call(String command) {
	sh("""#!/bin/bash
		set -x
		docker ${command}
	""")
}


