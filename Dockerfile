# Java development environment
FROM eclipse-temurin:21-jdk

# Install basic development tools
RUN apt-get update && \
    apt-get install -y \
    nano \
    vim \
    curl \
    git \
    && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Default to bash shell for development
CMD ["/bin/bash"]