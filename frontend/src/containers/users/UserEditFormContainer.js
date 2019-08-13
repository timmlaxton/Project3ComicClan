import React, {Component} from 'react';
import UserEditForm from '../../components/users/UserEditForm';
import Request from '../../helpers/request';
import UserPage from '../../components/users/UserPage';
import {Redirect} from 'react-router';

class UserEditFormContainer extends Component {

  constructor(props){
    super(props);
    this.state={
      redirect: false
    }
      console.log(props);
    this.handleUserUpdate = this.handleUserUpdate.bind(this);
  }

  onUserSelected(user){
    this.props.handleUserSelect(user)
    this.setState({redirect:true})
  }

  handleUserUpdate(updateUser){
    const request = new Request();
    request.patch('/api/users/' + this.props.user.id, updateUser)
    // .then(() => {
    //   window.location = '/'
    // })
    .then(res => res.json())
    .then(dbUpdatedUser => this.onUserSelected(dbUpdatedUser))
  }

  render(){

    const {redirect} = this.state
    if(redirect){
      const url = '/users/' + this.props.user.id
      return(
        <div>
          <Redirect to={url} user={this.props.user}/>
          <UserPage user={this.props.user} users={this.props.users} comics={this.props.comics} onDelete={this.handleDelete}/>
        </div>
      )
    }
  return(
    <UserEditForm user={this.props.user} handleUserUpdate={this.handleUserUpdate}/>
  )
  }

}

export default UserEditFormContainer;
