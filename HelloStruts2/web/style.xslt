<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" />
	<xsl:template match="result">
		<html>
			<body>
				<h2>XSLT Result Example</h2>
				<h4>
					Code :
					<xsl:value-of select="code" />
				</h4>
				<h4>
					Name :
					<xsl:value-of select="name" />
				</h4>
				<h4>
					City :
					<xsl:value-of select="city" />
				</h4>
				<h4>
					Salary :
					<xsl:value-of select="salary" />
				</h4>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>