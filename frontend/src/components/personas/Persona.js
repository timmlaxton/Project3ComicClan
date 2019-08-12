import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Persona = (props) =>{

  if(!props.persona){
    return "Loading...character"
  }

    const url = "/characters/" + props.persona.id;

  return (
    <React.Fragment>
    <img src={props.persona.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" />
      <p>Name: {props.persona.name}</p>
      <p>Alias: {props.persona.alias}</p>
      <p>Super Power: {props.persona.superPower}</p>
      <p>First Appearance: {props.persona.firstAppearance}</p>
    </React.Fragment>
  )

}

export default Persona;
