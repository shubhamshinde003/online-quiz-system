function startQuiz(quizType) {
    if (quizType === 'net') {
        // Custom alert for .Net Quiz
        alert('Starting .Net Quiz!');
    } else {
        // General alert for other quizzes
        alert(`Starting ${quizType.charAt(0).toUpperCase() + quizType.slice(1)} Quiz!`);
    }

    // Redirecting to the corresponding quiz page
    window.location.href = `${quizType}-quiz.html`;
}

