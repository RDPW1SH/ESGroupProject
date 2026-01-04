### Login de utilizadores

Exemplo de utilizadores predefinidos no sistema:

Nome Tipo Password
joao Paciente 1234
maria Médico abcd
carlos Enfermeiro enf123
ana Administrador Hospitalar admin123
beatriz Farmacêutico prof123

### Paciente

Id Utilizador Tipo Utilizador Nome Email Idade Password Telemóvel Id Paciente Id Seguro Data Nascimento Género Morada
1 Paciente joao joao.silva@email.com 30 1234 912345678 1 1 12-06-1993 Masculino Rua Saúde, 10

### Consultas

ID Tipo Paciente Médico Estado Início Fim
1 1 1 1 AGENDADA 04-01-2026 10:00 04-01-2026 11:00
2 2 1 2 CONCLUIDA 01-01-2026 10:00 01-01-2026 11:00

### Tipos de consultas

ID Descrição Duração (min) Valor Base (€)
1 Geral 30 20.00
2 Fisioterapia 45 30.00

### Exames

ID Tipo Consulta Estado Data Pedido Data Resultado Resultado
1 1 1 PENDENTE 29-12-2025 10:00 - -
2 1 1 CONCLUIDO 31-12-2025 10:00 02-01-2026 10:00 Normal
3 2 2 PENDENTE 01-01-2026 10:00 - -

### Tipos de exames

ID Descrição Duração (min) Valor Base (€)
1 Geral 30 20.00
2 Fisioterapia 45 30.00

### Escalas Profissionais

ID Profissional Início Fim
1 100 01-01-2026 00:00 10-01-2026 23:59
2 100 15-01-2026 00:00 20-01-2026 23:59
3 200 05-01-2026 00:00 12-01-2026 23:59

### Faturas

ID Consulta Base (€) Total (€) Data Emissão Estado

1 1 50.00 50.00 02-01-2026 10:00 PENDENTE
2 2 80.00 80.00 01-01-2026 10:00 PAGA

### Seguros Saude

ID Seguradora Comparticipação (%)
1 Medicare 10
2 Cofidis 20
