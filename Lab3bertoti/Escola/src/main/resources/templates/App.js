function addDisciplina() {
    const id = document.getElementById('add-id').value;
    const nomeDisciplina = document.getElementById('add-nome-disciplina').value;
    fetch('http://localhost:8080/escola', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ id, nomeDisciplina })
    })
        .then(response => response.text())
        .then(html => {
            document.getElementById('escola-list').innerHTML = html;
            alert('Disciplina cadastrada com sucesso!');
        })
        .catch(error => console.error('Erro ao adicionar disciplina:', error));
}

function updateDisciplina() {
    const id = document.getElementById('update-id').value;
    const nomeDisciplina = document.getElementById('update-nome-disciplina').value;
    fetch(`http://localhost:8080/escola/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nomeDisciplina })
    })
        .then(response => response.text())
        .then(html => {
            document.getElementById('escola-list').innerHTML = html;
            alert('Disciplina atualizada com sucesso!');
        })
        .catch(error => console.error('Erro ao atualizar disciplina:', error));
}

function deleteDisciplina() {
    const id = document.getElementById('delete-id').value;
    fetch(`http://localhost:8080/escola/${id}`, {
        method: 'DELETE'
    })
        .then(response => response.text())
        .then(html => {
            document.getElementById('escola-list').innerHTML = html;
            alert('Disciplina removida com sucesso!');
        })
        .catch(error => console.error('Erro ao remover disciplina:', error));
}
