# Stanford coursework

Workspace for my Stanford classes, where Claude does the legwork: study guides,
explanations, practice problems, feedback on drafts and code, and keeping track
of deadlines.

## Giving Claude a task

- **In chat:** start a Claude Code session on this repo and say what you need,
  e.g. "CS106B: make me a study guide for midterm 1."
- **On the board:** add a line to [`TASKS.md`](TASKS.md) (works from the GitHub
  app), then tell Claude "do my tasks".

Claude saves results in the course's folder and commits them.

## Adding a class

Tell Claude "add CS106B" and paste the syllabus. The more Claude
has (schedule, handouts, slides), the more it can help.

## Layout

| Path | What's there |
|---|---|
| `TASKS.md` | Task board |
| `courses/<CODE>/README.md` | Course card: links, grading, deadlines |
| `courses/<CODE>/assignments/` | One folder per assignment |
| `courses/<CODE>/notes/` | Lecture and reading notes |
| `courses/<CODE>/study/` | Study guides, practice problems, flashcards |
| `courses/_template/` | Starting point for a new class |
| `CLAUDE.md` | How Claude works here |
